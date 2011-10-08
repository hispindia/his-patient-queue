/**
 *  Copyright 2010 Health Information Systems Project of India
 *
 *  This file is part of Patient-queue module.
 *
 *  Patient-queue module is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.

 *  Patient-queue module is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with Patient-queue module.  If not, see <http://www.gnu.org/licenses/>.
 *
 **/

package org.openmrs.module.patientqueue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.module.ModuleActivator;

/**
 * This class contains the logic that is run every time this module is either started or shutdown
 */
public class PatientQueueActivator implements ModuleActivator{
	
	private Log log = LogFactory.getLog(this.getClass());
	

	public void contextRefreshed() {
		// TODO Auto-generated method stub
		
	}
	public void started() {
		// TODO Auto-generated method stub
		log.info("Started PATIENTQUEUE Module");
	}

	public void stopped() {
		// TODO Auto-generated method stub
		log.info("Stoped PATIENTQUEUE Module");
	}
	public void willRefreshContext() {
		// TODO Auto-generated method stub
		
	}

	public void willStart() {
		// TODO Auto-generated method stub
		log.info("Starting PATIENTQUEUE Module");
	}

	public void willStop() {
		// TODO Auto-generated method stub
		log.info("Shutting down PATIENTQUEUE Module");
	}
	
}
